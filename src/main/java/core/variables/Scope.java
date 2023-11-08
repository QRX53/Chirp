package core.variables;

import core.Value;

import java.util.ArrayList;

public class Scope {

    // Storage for variables and functions and such
    public ArrayList<Value> variables = new ArrayList<Value>();
    public ArrayList<Function> fns = new ArrayList<Function>();
    public String pack;
    public Scope parent;


}
