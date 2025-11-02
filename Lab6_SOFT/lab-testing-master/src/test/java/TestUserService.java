import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import sebas.lab.testing.User;
import sebas.lab.testing.UserRepository;
import sebas.lab.testing.UserService;

public class TestUserService {
    
    private UserRepository mockRepository;
    private UserService userService;
    
    @Before
    public void setUp() {
        mockRepository = mock(UserRepository.class);
        userService = new UserService(mockRepository);
    }
    
    // 6. Tests para getUserName() usando Mocks
    
    @Test
    public void testGetUserName_UsuarioExiste() {
        User usuario = new User("123", "Juan");
        when(mockRepository.findById("123")).thenReturn(usuario);
        
        String nombre = userService.getUserName("123");
        
        assertEquals("Juan", nombre);
        verify(mockRepository, times(1)).findById("123");
    }
    
    @Test
    public void testGetUserName_UsuarioNoExiste() {
        when(mockRepository.findById("999")).thenReturn(null);
        
        try {
            userService.getUserName("999");
            // Si llegamos aquí, el test falla porque debería lanzar excepción
            assertEquals("Se esperaba IllegalArgumentException", true, false);
        } catch (IllegalArgumentException e) {
            // Verificar el mensaje de error
            assertEquals("User not found", e.getMessage());
        }
        
        // Verificar que findById fue llamado 1 vez (después del try-catch)
        verify(mockRepository, times(1)).findById("999");
    }
}
