
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

public class modulkoneksi implements IRemote{
	public static modulkoneksi mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public modulkoneksi() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, modulkoneksi.class);
    static {
		mostCurrent = new modulkoneksi();
        remoteMe = RemoteObject.declareNull("b4a.example.modulkoneksi");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("modulkoneksi"), "b4a.example.modulkoneksi");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.modulkoneksi"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mhandler = RemoteObject.declareNull("mysql.mysqlhandler");
public static RemoteObject _results = RemoteObject.declareNull("mysql.mysqlhandler.ResultSetWrapper");
public static b4a.example.main _main = null;
public static b4a.example.modulhomepage _modulhomepage = null;
public static b4a.example.modulloginadmin _modulloginadmin = null;
public static b4a.example.moduldashboard _moduldashboard = null;
public static b4a.example.modulalat01 _modulalat01 = null;
public static b4a.example.modulloginalat _modulloginalat = null;
public static b4a.example.modullaporanbulananalat _modullaporanbulananalat = null;
public static b4a.example.laporandatasensor _laporandatasensor = null;
public static b4a.example.modulgambar _modulgambar = null;
public static b4a.example.modullaporanbulanan _modullaporanbulanan = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"LaporanDataSensor",Debug.moduleToString(b4a.example.laporandatasensor.class),"Main",Debug.moduleToString(b4a.example.main.class),"MHandler",modulkoneksi._mhandler,"ModulAlat01",Debug.moduleToString(b4a.example.modulalat01.class),"ModulDashboard",Debug.moduleToString(b4a.example.moduldashboard.class),"ModulGambar",Debug.moduleToString(b4a.example.modulgambar.class),"ModulHomePage",Debug.moduleToString(b4a.example.modulhomepage.class),"ModulLaporanBulanan",Debug.moduleToString(b4a.example.modullaporanbulanan.class),"ModulLaporanBulananAlat",Debug.moduleToString(b4a.example.modullaporanbulananalat.class),"ModulLoginAdmin",Debug.moduleToString(b4a.example.modulloginadmin.class),"ModulLoginAlat",Debug.moduleToString(b4a.example.modulloginalat.class),"ResultS",modulkoneksi._results,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}