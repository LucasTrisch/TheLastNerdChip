package apiNerdChip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apiNerdChip.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui você pode adicionar consultas personalizadas, por exemplo:
    // Optional<Usuario> findByEmail(String email);
}