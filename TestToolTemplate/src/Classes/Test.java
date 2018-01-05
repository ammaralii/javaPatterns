/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Samir
 */
public abstract class Test {
    private String testerName;
    private Date dateTime;
    private String machineRam;
    private String machineProcessor;
    private String logFileName;

    abstract  void test1();
     
    abstract  void test2();
    abstract  void test3();
    abstract  void test4();
    abstract  void test5();
    
    /**
     * @return the logFileName
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * @param logFileName the logFileName to set
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * @return the testerName
     */
    public String getTesterName() {
        return testerName;
    }

    /**
     * @param testerName the testerName to set
     */
    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    /**
     * @return the time
     */
    public Date getTime() {
        return dateTime;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time) {
        this.dateTime = time;
    }

    /**
     * @return the machineRam
     */
    public String getMachineRam() {
        return machineRam;
    }

    /**
     * @param machineRam the machineRam to set
     */
    public void setMachineRam(String machineRam) {
        this.machineRam = machineRam;
    }

    /**
     * @return the machineProcessor
     */
    public String getMachineProcessor() {
        return machineProcessor;
    }

    /**
     * @param machineProcessor the machineProcessor to set
     */
    public void setMachineProcessor(String machineProcessor) {
        this.machineProcessor = machineProcessor;
    }

    public void executetest(){
        TestLogger log = TestLogger.getInst("TestResult");
        Instant Instant = null;
        Instant start = Instant.now();
        execute();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
    }
   
    public final void execute(){
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
