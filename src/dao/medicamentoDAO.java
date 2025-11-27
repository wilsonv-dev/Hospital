package dao;

import model.Medicamento;
import java.util.List;

public interface medicamentoDAO {
    void agregar(Medicamento medicamento);
    Medicamento consultar(int id);
    void actualizar(Medicamento medicamento);
    void eliminar(int id);
    List<Medicamento> listar();
}
