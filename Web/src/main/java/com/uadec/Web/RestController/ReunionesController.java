
package com.uadec.Web.RestController;

import com.uadec.Web.reunion.Reunion;
import com.uadec.Web.repositorio.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reunion")
public class ReunionesController {

    private final ReunionRepository reunionRepository;

    @Autowired
    public ReunionesController(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    @PostMapping("/guardar")
    public String guardarReunion(Reunion reunion) {
        reunionRepository.save(reunion);
        return "redirect:/reunion/confirmacion";
    }

    @RequestMapping("/confirmacion")
    public String mostrarConfirmacion() {
        return "confirmacion";
    }
}
