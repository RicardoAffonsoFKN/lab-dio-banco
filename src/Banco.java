import java.util.List;
import java.util.ArrayList;

public class Banco {
    
    private ArrayList<Conta> contas;
    private String nome;

    public Banco(String nome) {
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public void incluirConta(Conta conta) throws NullPointerException {

        if (conta == null) {
            throw new NullPointerException();
        }

        this.contas.add(conta);
    }

    public void excluirConta(Conta conta) throws NullPointerException {
        if (conta == null) {
            throw new NullPointerException();
        }

        this.contas.remove(conta);
    }

    public Conta getContaByIndex(int id) throws NullPointerException {
        if (id < 0 || id > contas.size()) {
            throw new NullPointerException();
        }

        return this.contas.get(id);
    }

    public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return this.contas;
	}
    
}
