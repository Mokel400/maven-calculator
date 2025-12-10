package com.dam2.calculator;

import com.dam2.calculator.ops.OpMultiplicar;
import com.dam2.calculator.ops.OpResta;
import com.dam2.calculator.ops.OpSuma;
import com.dam2.calculator.ops.OpMax;

public class OperationRouter {

    private static final String OPS_LINE = "Operaciones: suma, resta, multiplicacion";

    public static String help() {
        return OPS_LINE + "\n" +
               "Formato: operacion + numeros separados por espacios\n" +
               "Ej: suma | 3 5 10";
    }

    public static String run(String op, String input) {
        switch (op.trim().toLowerCase()) {
            case "suma": return OpSuma.run(input);
            case "resta": return OpResta.run(input);
            case "maximo" : return OpMax.run(input);
            case "multiplicacion": return OpMultiplicar.run(input);

            default: return "Operación no reconocida. Escribe 'help'.";
            
           
        }
    }
}
