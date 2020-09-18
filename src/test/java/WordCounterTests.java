import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTests {

    private WordCounter sut = new WordCounter();

    @Test
    public void getWordCount_WhenPunctuationsIgnored_ShouldReturnUniqueWordsCount() {
        //Arrange
        String sentence = "Given a series of 'String' inputs, output the number of unique words seen. This is a test and a good test.";

        //Act
        int word_count = sut.getWordCount(sentence);

        //Assert
        assertEquals(17, word_count);
    }

    @Test
    public void ignorePunctuationsExceptApostrophes_WhenPunctuationsIgnored_ShouldReturnString() {
        //Arrange
        String sentence = "This test is punctuations , and capital Cases test. Try apostrophe's.";

        //Act
        String new_sentence = sut.ignorePunctuationsExceptApostrophes(sentence);

        //Assert
        assertThat(new_sentence).isEqualTo("this test is punctuations   and capital cases test  try apostrophe's ");
    }


}
