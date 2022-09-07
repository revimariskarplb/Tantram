
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _btnalat = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.starter _starter = null;
public static b4a.example.modulhomepage _modulhomepage = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modulgambar _modulgambar = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulloginadmin _modulloginadmin = null;
public static b4a.example.modulkoneksi _modulkoneksi = null;
public static b4a.example.moduldashboard _moduldashboard = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btnAdmin",main.mostCurrent._btnadmin,"btnAlat",main.mostCurrent._btnalat,"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulHomePage",Debug.moduleToString(b4a.example.modulhomepage.class),"ModulKoneksi",Debug.moduleToString(b4a.example.modulkoneksi.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"xui",main._xui};
}
}