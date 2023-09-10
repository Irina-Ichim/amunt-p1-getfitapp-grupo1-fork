import com.gitfit.backend.domain.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(private val userRepository: UserRepository) {

    @PostMapping("/registro")
    fun registerUser(@RequestBody user: User): User {
        // Aquí debes implementar la lógica para registrar un nuevo usuario en tu base de datos
        // Puedes usar userRepository para guardar el usuario en la base de datos.
        // Asegúrate de realizar validaciones y manejar errores adecuadamente.
        // Devuelve el usuario registrado o un mensaje de error.
        // Por ejemplo, aquí devolvemos el usuario que se registró (esto es solo un ejemplo).
        return user
    }

    @PostMapping("/login")
    fun loginUser(@RequestBody user: User): User {
        // Implementa la lógica de autenticación aquí
        // Devuelve el usuario autenticado o un mensaje de error si la autenticación falla.
        // Por ejemplo, aquí devolvemos el usuario que se autenticó (esto es solo un ejemplo).
        return user
    }
}




