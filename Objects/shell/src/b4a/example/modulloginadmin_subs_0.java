package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulloginadmin_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulloginadmin) ","modulloginadmin",2,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"LoginAdmin\")";
Debug.ShouldStop(4194304);
modulloginadmin.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LoginAdmin")),modulloginadmin.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (modulloginadmin) ","modulloginadmin",2,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (modulloginadmin) ","modulloginadmin",2,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (modulloginadmin) ","modulloginadmin",2,modulloginadmin.mostCurrent.activityBA,modulloginadmin.mostCurrent,36);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.modulloginadmin.remoteMe.runUserSub(false, "modulloginadmin","btnlogin_click");}
 BA.debugLineNum = 36;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
modulloginadmin.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 38;BA.debugLine="StartActivity(ModulDashboard)";
Debug.ShouldStop(32);
modulloginadmin.mostCurrent.__c.runVoidMethod ("StartActivity",modulloginadmin.processBA,(Object)((modulloginadmin.mostCurrent._moduldashboard.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 17;BA.debugLine="Private edtUsername As EditText";
modulloginadmin.mostCurrent._edtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private edtPassword As EditText";
modulloginadmin.mostCurrent._edtpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}