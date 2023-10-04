package core;

import java.util.HashMap;

public class Env {

    public static Env global = new Env();

    public HashMap<String, Object> variables = new HashMap<>();

}
