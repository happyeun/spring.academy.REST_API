/* 
 
package example.cashcard;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

@JsonTest
class CashCardJsonTest {
        
        
        @Test
        void myFirstTest() {
                //assertThat(1).isEqualTo(42); // TDD junit 사용해서.
                assertThat(42).isEqualTo(42);
        }
        
        @Autowired
        private JacksonTester<CashCard> json;
        
        @Test
        void cashCardSerializationTest() throws IOException {
                // CashCard 클래스 및 Json 연결 테스트
                CashCard cashCard = new CashCard(99L, 123.45);
                assertThat(json.write(cashCard)).isStrictlyEqualToJson("expected.json");
                assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.id");
                assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.id")
                .isEqualTo(99);
                assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.amount");
                assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.amount")
                .isEqualTo(123.45);
        }
        
   @Test
   void cashCardDeserializationTest() throws IOException {
           String expected = """
                   {
                           "id":99,
                           "amount":123.45
                        }
                        """;
                        /*               
                        assertThat(json.parse(expected))
                        .isEqualTo(new CashCard(1000L, 67.89));
                        assertThat(json.parseObject(expected).id()).isEqualTo(1000);
                        assertThat(json.parseObject(expected).amount()).isEqualTo(67.89);
                        */ 
//                        assertThat(json.parse(expected))
//                        .isEqualTo(new CashCard(99L, 123.45));
//                        assertThat(json.parseObject(expected).id()).isEqualTo(99);
//                        assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
//                }
                
//}


//