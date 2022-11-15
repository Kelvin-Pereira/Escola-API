package com.example.demo.config.thymeleaf;

import com.example.demo.config.exceptions.NegocioException;
import com.lowagie.text.DocumentException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class ThymeleafService {
    private final SpringTemplateEngine templateEngine;

    public byte[] gerarPdf(String template, Context context) {
        String html = templateEngine.process(template, context);
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(html, new ClassPathResource("/").getURL().toExternalForm());
            renderer.layout();
            renderer.createPDF(outputStream);

            return outputStream.toByteArray();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            throw new NegocioException("thymeleaf.erro.gerar.pdf");
        }
    }
}
