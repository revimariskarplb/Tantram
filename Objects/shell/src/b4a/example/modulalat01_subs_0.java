package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modulalat01_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (modulalat01) ","modulalat01",5,modulalat01.mostCurrent.activityBA,modulalat01.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.modulalat01.remoteMe.runUserSub(false, "modulalat01","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"Scrollview\")";
Debug.ShouldStop(1048576);
modulalat01.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Scrollview")),modulalat01.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="ScrollView1.Panel.LoadLayout(\"Alat01\")";
Debug.ShouldStop(4194304);
modulalat01.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Alat01")),modulalat01.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.Width=320dip";
Debug.ShouldStop(8388608);
modulalat01.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",modulalat01.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320))));
 BA.debugLineNum = 25;BA.debugLine="ScrollView1.Panel.Height=1790dip";
Debug.ShouldStop(16777216);
modulalat01.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",modulalat01.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1790))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (modulalat01) ","modulalat01",5,modulalat01.mostCurrent.activityBA,modulalat01.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.modulalat01.remoteMe.runUserSub(false, "modulalat01","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (modulalat01) ","modulalat01",5,modulalat01.mostCurrent.activityBA,modulalat01.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.modulalat01.remoteMe.runUserSub(false, "modulalat01","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
modulalat01.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}