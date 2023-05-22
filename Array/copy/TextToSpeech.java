package Array.copy;

import java.util.Scanner;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class TextToSpeech {
    public static void main(String[] args) {
        // read input text from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text to read aloud: ");
        String text = scanner.nextLine();

        // use Windows TTS engine to read text aloud
        try {
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Central.registerEngineCentral("com.sun.speech.synthesis.SynthesizerCentral");
            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.ENGLISH));
            synthesizer.allocate();
            synthesizer.resume();
            synthesizer.speakPlainText(text, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.deallocate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // use simple AI algorithm to determine sentiment of text
        int positiveCount = 0;
        int negativeCount = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase("good") || word.equalsIgnoreCase("great") || word.equalsIgnoreCase("awesome")) {
                positiveCount++;
            } else if (word.equalsIgnoreCase("bad") || word.equalsIgnoreCase("terrible") || word.equalsIgnoreCase("awful")) {
                negativeCount++;
            }
        }

        // print sentiment analysis result
        if (positiveCount > negativeCount) {
            System.out.println("The sentiment of the text is positive.");
        } else if (positiveCount < negativeCount) {
            System.out.println("The sentiment of the text is negative.");
        } else {
            System.out.println("The sentiment of the text is neutral.");
        }
    }
}
