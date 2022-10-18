package ok.team.sms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Oybek Karimjanov
 * Date : 10.18.2022
 * Project Name : sms
 */
@RestController
public class TestController {

    @GetMapping
    public String getHi() {
        return "Hello Mother Fucker!";
    }
}
