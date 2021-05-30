package com.cheermorning.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class Client {

    public static void main(String[] args) {

        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        OutPutImpl outPut = new OutPutImpl(collegeList);

        outPut.printCollege();
    }
}
