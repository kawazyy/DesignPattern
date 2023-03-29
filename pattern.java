public class Fila {
    private static Fila instancia;

    private Fila() {
        // Construtor privado para impedir a criação de instâncias fora da classe
    }

    public static synchronized Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

    public void imprimeDocumento(Documento documento) {
        // Adiciona o documento à fila de impressão
    }

    public void removeDocumento(Documento documento) {
        // Remove um documento específico da fila de impressão
    }

    public void removeTodosDocumentos() {
        // Remove todos os documentos da fila de impressão
    }
}
