package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"HomePage\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomePage")),main.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnadmin_click() throws Exception{
try {
		Debug.PushSubsStack("btnAdmin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("btnadmin_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnadmin_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub btnAdmin_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 47;BA.debugLine="StartActivity(ModulLoginAdmin)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._modulloginadmin.getObject())));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnalat_click() throws Exception{
try {
		Debug.PushSubsStack("btnAlat_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("btnalat_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnalat_click");}
 BA.debugLineNum = 40;BA.debugLine="Private Sub btnAlat_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 42;BA.debugLine="StartActivity(ModulLoginAlat)";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._modulloginalat.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btngambar_click() throws Exception{
try {
		Debug.PushSubsStack("btnGambar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("btngambar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btngambar_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub btnGambar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 52;BA.debugLine="StartActivity(ModulGambar)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._modulgambar.getObject())));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private btnAlat As Button";
main.mostCurrent._btnalat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnAdmin As Button";
main.mostCurrent._btnadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
modulhomepage_subs_0._process_globals();
modulloginalat_subs_0._process_globals();
modulgambar_subs_0._process_globals();
modulalat01_subs_0._process_globals();
modulloginadmin_subs_0._process_globals();
modulkoneksi_subs_0._process_globals();
moduldashboard_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
modulhomepage.myClass = BA.getDeviceClass ("b4a.example.modulhomepage");
modulloginalat.myClass = BA.getDeviceClass ("b4a.example.modulloginalat");
modulgambar.myClass = BA.getDeviceClass ("b4a.example.modulgambar");
modulalat01.myClass = BA.getDeviceClass ("b4a.example.modulalat01");
modulloginadmin.myClass = BA.getDeviceClass ("b4a.example.modulloginadmin");
modulkoneksi.myClass = BA.getDeviceClass ("b4a.example.modulkoneksi");
moduldashboard.myClass = BA.getDeviceClass ("b4a.example.moduldashboard");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}