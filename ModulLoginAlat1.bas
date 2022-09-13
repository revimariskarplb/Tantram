B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim md As MessageDigest
	Dim ByteCon As ByteConverter
	Dim passwordhash() As Byte
	Dim epass As String
	Dim p As String

	Private btnMasuk As Button
	Private edtKodeAlat As EditText
	Private edtPassword As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("LoginAlat")
	
	'ModulKoneksi.koneksi

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnMasuk_Click
	
	'cek input kosong atau tidak 
	If edtKodeAlat.Text = "" Then
		MsgboxAsync("Masukan Kode Alat","Info")
		Return
	End If
	
	If edtPassword.Text = "" Then
		MsgboxAsync("Masukan Password","Info")
		Return
	End If
	
	'panggil koneksi
	ModulKoneksi.koneksi
	
	'ambil password masukkan ke p
	p=edtPassword.Text
	
	'panggil enkripsi
	enkripsi
	
	'cek kode alat
	ModulKoneksi.ResultS = ModulKoneksi.MHandler.Query("SELECT * FROM tb_alat WHERE kode_alat = '" & edtKodeAlat.Text & "'")
	If ModulKoneksi.ResultS.RowCount > 0 Then
		'jika ditemukan, cek kode lat
		ModulKoneksi.ResultS = ModulKoneksi.MHandler.Query("SELECT * FROM tb_alat WHERE kode_alat ='" & edtKodeAlat.Text & "' and password='" & epass & "'")
		If ModulKoneksi.ResultS.RowCount > 0 Then
			'jika ditemukan, tampilkan halaman Alat01
			
			'tutup koneksi
			ModulKoneksi.MHandler.Close
			
			'membuka halaman Alat01
			Activity.Finish
			StartActivity(ModulAlat01)
		Else
			'jik tidak ditemukan, muncul pesan 
			MsgboxAsync("Password tidak ditemukan","info")
			edtPassword.Text =""
			Return
		End If
	Else
		'jika tidak ditemukan, muncul pesan
		MsgboxAsync("Kode Alat tidak ditemukan","info")
		edtKodeAlat.Text =""
		Return
	End If
End Sub

Sub enkripsi
	passwordhash = md.GetMessageDigest(p.GetBytes("UTF8"),"MD5")
	epass = ByteCon.HexFromBytes(passwordhash)
End Sub