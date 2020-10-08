package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    HearingInterpreter hearingInterpreter(WordProducer wordProducer) {
        return new HearingInterpreter(wordProducer);
    }


}
