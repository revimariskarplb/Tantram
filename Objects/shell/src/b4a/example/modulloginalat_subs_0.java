package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulloginalat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulloginalat) ","modulloginalat",3,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"LoginAlat\")";
Debug.ShouldStop(8388608);
modulloginalat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoginAlat")),modulloginalat.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="ModulKoneksi.koneksi";
Debug.ShouldStop(33554432);
modulloginalat.mostCurrent._modulkoneksi.runVoidMethod ("_koneksi" /*RemoteObject*/ ,modulloginalat.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (modulloginalat) ","modulloginalat",3,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (modulloginalat) ","modulloginalat",3,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnMasuk_Click (modulloginalat) ","modulloginalat",3,modulloginalat.mostCurrent.activityBA,modulloginalat.mostCurrent,38);
if (RapidSub.canDelegate("btnmasuk_click")) { return b4a.example.modulloginalat.remoteMe.runUserSub(false, "modulloginalat","btnmasuk_click");}
 BA.debugLineNum = 38;BA.debugLine="Private Sub btnMasuk_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
modulloginalat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 40;BA.debugLine="StartActivity(\"Alat01\")";
Debug.ShouldStop(128);
modulloginalat.mostCurrent.__c.runVoidMethod ("StartActivity",modulloginalat.processBA,(Object)((RemoteObject.createImmutable("Alat01"))));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private edtKodeAlat As EditText";
modulloginalat.mostCurrent._edtkodealat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edtPassword As EditText";
modulloginalat.mostCurrent._edtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}