import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Word> wordList;
        String Str = "Жили-были старик со старухой. Однажды старик попросил старуху испечь ему колобок. Муки нет, но по коробу старуха поскребла, по сусеку помела, и замесила тесто. Спёкся румяный колобок. Положила его на окошко студиться."; //исходная строка, которая останется без изменений
        StringBuilder result = new StringBuilder(); //строка которая будет подвергнута изменеию
        System.out.println("Исходная строка: \n" + Str);
        wordList = new Sentence(Str).splitWords(); //разделяем строку Str
        for (Word word : wordList) {
            result.append(word.shuffleLetters()); //добавляем изменённые слова в строку results
        }
        System.out.println("Новая строка: \n" + result);
    }
}