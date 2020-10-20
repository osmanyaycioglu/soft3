package com.training.java.patterns.builder;


public class Imm {

    public static void main(final String[] args) {
        String stringLoc0 = new String("osman");

        StringBuilder builderLoc = new StringBuilder(1_000_000);
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            //            stringLoc0 += " ";
            //            stringLoc0 += iLoc;
            //            stringLoc0 += " ";
            //            stringLoc0 += "osman";

            //            builderLoc.append(" ");
            //            builderLoc.append(iLoc);
            //
            //            String.format("osman %s %s %d",
            //                          "yaycioglu",
            //                          "adana",
            //                          iLoc);
            String f = "osman " + "yaycioglu" + "adana" + iLoc;

            //            builderLoc.append(" ")
            //                      .append(iLoc)
            //                      .append(" ")
            //                      .append("osman");
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


        String str = "osman" + stringLoc0 + " " + 100 + " yay";
        // code
        str += "gc";

        String stringLoc1 = "osman";
        String stringLoc2 = "osman";
        stringLoc2 += " yaycıoğlu";
        stringLoc2 += " 50";
        String concatLoc = stringLoc2.concat("xyz");

    }
}
