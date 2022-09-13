package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulloginalat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulloginalat) ","modulloginalat",6,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"LoginAlat\")";
Debug.ShouldStop(268435456);
modulloginalat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoginAlat")),modulloginalat.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (modulloginalat) ","modulloginalat",6,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (modulloginalat) ","modulloginalat",6,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmasuk_click() throws Exception{
try {
		Debug.PushSubsStack("btnMasuk_Click (modulloginalat) ","modulloginalat",6,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,44);
if (RapidSub.canDelegate("btnmasuk_click")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","btnmasuk_click");}
 BA.debugLineNum = 44;BA.debugLine="Private Sub btnMasuk_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 47;BA.debugLine="If edtKodeAlat.Text = \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",modulloginalat.mostCurrent._edtkodealat.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 48;BA.debugLine="MsgboxAsync(\"Masukan Kode Alat\",\"Info\")";
Debug.ShouldStop(32768);
modulloginalat.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukan Kode Alat")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),modulloginalat.processBA);
 BA.debugLineNum = 49;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 52;BA.debugLine="If edtPassword.Text = \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",modulloginalat.mostCurrent._edtpassword.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="MsgboxAsync(\"Masukan Password\",\"Info\")";
Debug.ShouldStop(1048576);
modulloginalat.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Masukan Password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),modulloginalat.processBA);
 BA.debugLineNum = 54;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 58;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(33554432);
modulloginalat.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,modulloginalat.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="p=edtPassword.Text";
Debug.ShouldStop(268435456);
modulloginalat.mostCurrent._p = modulloginalat.mostCurrent._edtpassword.runMethod(true,"getText");
 BA.debugLineNum = 64;BA.debugLine="enkripsi";
Debug.ShouldStop(-2147483648);
_enkripsi();
 BA.debugLineNum = 67;BA.debugLine="ModulKoneksi.ResultS = ModulKoneksi.MHandler.Quer";
Debug.ShouldStop(4);
modulloginalat.mostCurrent._modulkoneksi._results /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), modulloginalat.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_alat WHERE kode_alat = '"),modulloginalat.mostCurrent._edtkodealat.runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 68;BA.debugLine="If ModulKoneksi.ResultS.RowCount > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",modulloginalat.mostCurrent._modulkoneksi._results /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="ModulKoneksi.ResultS = ModulKoneksi.MHandler.Que";
Debug.ShouldStop(32);
modulloginalat.mostCurrent._modulkoneksi._results /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), modulloginalat.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runMethod(false,"Query",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tb_alat WHERE kode_alat ='"),modulloginalat.mostCurrent._edtkodealat.runMethod(true,"getText"),RemoteObject.createImmutable("' and password='"),modulloginalat.mostCurrent._epass,RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 71;BA.debugLine="If ModulKoneksi.ResultS.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",modulloginalat.mostCurrent._modulkoneksi._results /*RemoteObject*/ .runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="ModulKoneksi.MHandler.Close";
Debug.ShouldStop(1024);
modulloginalat.mostCurrent._modulkoneksi._mhandler /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 78;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
modulloginalat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 79;BA.debugLine="StartActivity(ModulAlat01)";
Debug.ShouldStop(16384);
modulloginalat.mostCurrent.__c.runVoidMethod ("StartActivity",modulloginalat.processBA,(Object)((modulloginalat.mostCurrent._modulalat01.getObject())));
 }else {
 BA.debugLineNum = 82;BA.debugLine="MsgboxAsync(\"Password tidak ditemukan\",\"info\")";
Debug.ShouldStop(131072);
modulloginalat.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Password tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info"))),modulloginalat.processBA);
 BA.debugLineNum = 83;BA.debugLine="edtPassword.Text =\"\"";
Debug.ShouldStop(262144);
modulloginalat.mostCurrent._edtpassword.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 88;BA.debugLine="MsgboxAsync(\"Kode Alat tidak ditemukan\",\"info\")";
Debug.ShouldStop(8388608);
modulloginalat.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Kode Alat tidak ditemukan")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info"))),modulloginalat.processBA);
 BA.debugLineNum = 89;BA.debugLine="edtKodeAlat.Text =\"\"";
Debug.ShouldStop(16777216);
modulloginalat.mostCurrent._edtkodealat.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 90;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enkripsi() throws Exception{
try {
		Debug.PushSubsStack("enkripsi (modulloginalat) ","modulloginalat",6,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,94);
if (RapidSub.canDelegate("enkripsi")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","enkripsi");}
 BA.debugLineNum = 94;BA.debugLine="Sub enkripsi";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="passwordhash = md.GetMessageDigest(p.GetBytes(\"UT";
Debug.ShouldStop(1073741824);
modulloginalat._passwordhash = modulloginalat.mostCurrent._md.runMethod(false,"GetMessageDigest",(Object)(modulloginalat.mostCurrent._p.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));
 BA.debugLineNum = 96;BA.debugLine="epass = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(-2147483648);
modulloginalat.mostCurrent._epass = modulloginalat.mostCurrent._bytecon.runMethod(true,"HexFromBytes",(Object)(modulloginalat._passwordhash));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim md As MessageDigest";
modulloginalat.mostCurrent._md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim ByteCon As ByteConverter";
modulloginalat.mostCurrent._bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 17;BA.debugLine="Dim passwordhash() As Byte";
modulloginalat._passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 18;BA.debugLine="Dim epass As String";
modulloginalat.mostCurrent._epass = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim p As String";
modulloginalat.mostCurrent._p = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Private btnMasuk As Button";
modulloginalat.mostCurrent._btnmasuk = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private edtKodeAlat As EditText";
modulloginalat.mostCurrent._edtkodealat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private edtPassword As EditText";
modulloginalat.mostCurrent._edtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}