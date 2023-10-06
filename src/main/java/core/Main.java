package core;

import antlr.ChirpLexer;
import antlr.ChirpParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("src/main/resources/test.chp");
        ChirpLexer lexer = new ChirpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ChirpParser parser = new ChirpParser(tokens);
        ChirpParser.ProgramContext programContext = parser.program();

        Visitor v = new Visitor();
        v.visit(programContext);
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", replacement);
    }

    public static boolean importFile(File path) {
        try {
            CharStream input = CharStreams.fromFileName(path.getPath());
            ChirpLexer lexer = new ChirpLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ChirpParser parser = new ChirpParser(tokens);
            ChirpParser.ProgramContext programContext = parser.program();

            Visitor v = new Visitor();
            v.visit(programContext);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
