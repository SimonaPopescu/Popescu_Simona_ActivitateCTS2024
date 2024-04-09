// DiagnosticAbstract ->abstract (printare())
// DiagnosticConcret (printare())
// DecoratorAbstract (afisareOnline() -> abstracta, printare())
// AplicatieMobila (decorator concret) -> mosteneste DecoratorAbstract (+ afisareOnline())
// Website (decorator concret) -> mosteneste DecoratorAbstract (+ afisareOnline())


import decorator.AplicatieMobila;
import decorator.Decorator;
import spital.Diagnostic;
import spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("raceala", "tuse, febra", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();
    }
}