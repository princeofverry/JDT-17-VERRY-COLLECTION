package com.indivaragroup;

import com.indivaragroup.challenge.list.ChallengeMain;
import com.indivaragroup.iterator.exam.ExampleCollectionAdd;
import com.indivaragroup.iterator.exam.ExampleCollectionCheck;
import com.indivaragroup.iterator.exam.ExampleCollectionRemove;
import com.indivaragroup.iterator.exam.ExampleIterator;
import com.indivaragroup.list.exam.ExampleList;

public class Main {
    public static void main(String[] args) {
        ExampleIterator.getExampleIterator();

        ExampleCollectionAdd.getCollectionToAdd();

        ExampleCollectionRemove.getCollectionToRemove();

//        ExampleCollectionCheck.getCollectionToCheck();

        ExampleList.getExampleList();

        ChallengeMain.challengeRun();
    }
}