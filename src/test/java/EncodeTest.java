import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class EncodeTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));
    }
}
