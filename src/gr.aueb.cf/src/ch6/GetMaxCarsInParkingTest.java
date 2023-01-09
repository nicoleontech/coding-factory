package ch6;

import homework.ch6.GetMaxCarsInParking;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GetMaxCarsInParkingTest {

    @Test
    void whenInputIsNull_throwIAE (){
        assertThatThrownBy(()-> GetMaxCarsInParking.getMaxCarsInParking(null))
                .isInstanceOf(IllegalArgumentException.class);
        }



    }

