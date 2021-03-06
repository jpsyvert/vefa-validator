package no.difi.vefa.validator;

import no.difi.vefa.validator.source.ClasspathSource;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Using multiple validators at the same time.
 */
public class MultipleValidators2 {

    @Test
    public void simple() throws Exception{
        Validator validator1 = ValidatorBuilder.newValidator()
                .setSource(new ClasspathSource("/rules/"))
                .build();
        Validator validator2 = ValidatorBuilder.newValidator()
                .setSource(new ClasspathSource("/rules/"))
                .build();

        Assert.assertFalse(validator1 == validator2);

        validator1.close();
        validator2.close();
    }
}
