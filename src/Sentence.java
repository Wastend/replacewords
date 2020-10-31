
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Word> splitWords() {
        List<String> words = Arrays.asList(sentence.split("\\b")); //разделяем слова
        List<Word> wordList  = new ArrayList<>();
        for (String word : words) {
            wordList.add(new Word(word)); //создаём строку
        }
        return wordList; //возвращаем

    }
}