package com.neusoft.spring.songouhe;

public class OutputHelper {
    IOutputGenerator outputGenerator;
    public void generateOutput(){
        outputGenerator.generatorOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
