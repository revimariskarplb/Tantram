package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class modulkoneksi {
private static modulkoneksi mostCurrent = new modulkoneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _mhandler = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.modulhomepage _modulhomepage = null;
public b4a.example.modulloginalat _modulloginalat = null;
public b4a.example.modulgambar _modulgambar = null;
public b4a.example.modulalat01 _modulalat01 = null;
public b4a.example.modulloginadmin _modulloginadmin = null;
public b4a.example.moduldashboard _moduldashboard = null;
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="modulkoneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub koneksi";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="MHandler.Initialize(\"meniti.id\", \"u7753801_db_tan";
_mhandler.Initialize("meniti.id","u7753801_db_tantram","u7753801_asepmustopa","4sepmust0p4");
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If MHandler.isConnected = False Then";
if (_mhandler.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="MsgboxAsync(\"Koneksi Terputus\",\"Info\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Koneksi Terputus"),BA.ObjectToCharSequence("Info"),(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="End Sub";
return "";
}
}