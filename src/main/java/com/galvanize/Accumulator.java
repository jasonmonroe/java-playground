package com.galvanize;

public class Accumulator {
    /*
    Failures (4):
  JUnit Jupiter:SnippetTest:toSentenceReturnsResultForArbitraryList()
    MethodSource [className = 'com.galvanize.SnippetTest', methodName = 'toSentenceReturnsResultForArbitraryList', methodParameterTypes = '']
    => org.opentest4j.AssertionFailedError: Array with arbitrary number of words ==> expected:
        <Frodo, Sam, Aragorn, Gimli, Boromir, Legolas, Gandalf, Merry and Pippin>
        but was: <Frodo, Sam Aragorn, Gimli, Boromir, Legolas, Gandalf, Merry, Pippin, and >

  JUnit Jupiter:SnippetTest:toSentenceReturnsResultForThreeWords()
    MethodSource [className = 'com.galvanize.SnippetTest', methodName = 'toSentenceReturnsResultForThreeWords', methodParameterTypes = '']
    => org.opentest4j.AssertionFailedError: Array with three words ==> expected:
        <class, interface and enum>
        but was: <class, interface enum, and >

  JUnit Jupiter:SnippetTest:toSentenceReturnsEmptyForArrayWithEmptyString()
    MethodSource [className = 'com.galvanize.SnippetTest', methodName = 'toSentenceReturnsEmptyForArrayWithEmptyString', methodParameterTypes = '']
    => org.opentest4j.AssertionFailedError: Array with empty string ==> expected:
        <>
        but was: < and >
  JUnit Jupiter:SnippetTest:toSentenceReturnsResultForTwoWords()
    MethodSource [className = 'com.galvanize.SnippetTest', methodName = 'toSentenceReturnsResultForTwoWords', methodParameterTypes = '']
    => org.opentest4j.AssertionFailedError: Array with two words ==> expected:
        <coffee and bagels>
        but was: <coffee, bagels and >
     */
    public void main(String args[]) {
        String input[]  = {"Frodo", "Sam", "Aragorn", "Gimli", "Boromir", "Legolas", "Gandalf", "Merry", "Pippin"};
        String sentence = this.toSentence(input);

        System.out.println(sentence);
    }


    /*
    In the space below, define and implement a method called toSentence. It takes as input an array of strings (String[])
    and returns a string that contains all the elements of the array joined by a comma, with the last element joined by
    "and".
     */
    public String toSentence(String[] input) {
        String sentence = "";

        if(input.length == 0 || input[0].equals("")){
            return "";
        }

        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);

            // comma
            if(i > 0 && i < input.length - 1){
                sentence = sentence.concat(", ");
            }

            sentence = sentence.concat(input[i]);

            // and
            if(i == input.length - 1){
                sentence = sentence.concat(" and ");
            }

        }

        return sentence;
    }
}
