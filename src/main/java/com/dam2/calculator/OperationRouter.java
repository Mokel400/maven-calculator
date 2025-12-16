package com.dam2.calculator;

import com.dam2.calculator.ops.OpDivision;
import com.dam2.calculator.ops.OpResta;
import com.dam2.calculator.ops.OpSuma;

public class OperationRouter {

    private static final String OPS_LINE = "Operaciones: suma, resta, division";

    public static String help() {
        return OPS_LINE + "\n" +
               "Formato: operacion + numeros separados por espacios\n" +
               "Ej: suma | 3 5 10";
    }

    public static String run(String op, String input) {
        switch (op.trim().toLowerCase()) {
            case "suma": return OpSuma.run(input);
            case "resta": return OpResta.run(input);
            case "division": return OpDivision.run(input);

            default: return "Operación no reconocida. Escribe 'help'.";
            
           
        }
    }
}
