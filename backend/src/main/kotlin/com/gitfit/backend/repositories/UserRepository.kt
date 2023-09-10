import com.gitfit.backend.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    // Métodos de repositorio personalizados si los tienes
}
