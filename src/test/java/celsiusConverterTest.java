import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class celsiusConverterTest {

    @Test
    public void F5toC(){

        //ARRANGE
        int fahrenheit = 5;

        //act
        double result = celsiusConverter.convertToCelsius(fahrenheit);

        //assert
        assertEquals(-15, result);

    }

    @Test
    public void C5toF(){

        //ARRANGE
        int celsius = 5;

        //act
        double result = celsiusConverter.convertToFahrenheit(celsius);

        //assert
        assertEquals(41, result);

    }

}