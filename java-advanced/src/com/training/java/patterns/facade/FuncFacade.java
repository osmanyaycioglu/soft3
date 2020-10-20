package com.training.java.patterns.facade;


public class FuncFacade {

    public String doAll() {
        Lib1 lib1Loc = new Lib1();
        Lib2 lib2Loc = new Lib2();
        WebService1 ws1 = new WebService1();
        WebService2 ws2 = new WebService2();

        String doThingLoc = lib1Loc.doThing();
        String deleteThingLoc = lib2Loc.deleteThing();
        String serviceLoc = ws1.service();
        String service2Loc = ws2.service();
        return doThingLoc;
    }

    public String doSome() {
        Lib1 lib1Loc = new Lib1();
        Lib2 lib2Loc = new Lib2();
        WebService1 ws1 = new WebService1();
        WebService2 ws2 = new WebService2();

        String doThingLoc = lib1Loc.doThing();
        String serviceLoc = ws1.service();
        String service2Loc = ws2.service();
        return doThingLoc;
    }


}
