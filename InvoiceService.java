package com.JobFindingPlatform.Service;

import java.io.ByteArrayOutputStream;
import org.springframework.stereotype.Service;
import com.JobFindingPlatform.Entity.Payment;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class InvoiceService {
    
    public byte[] generateInvoice(Payment payment) {
        try {
            Document document = new Document();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            PdfWriter.getInstance(document, baos);
            document.open();
            
            // Title
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Paragraph title = new Paragraph("Payment Invoice", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            
            // Add spacing
            document.add(new Paragraph(" "));
            
            // Invoice details
            document.add(new Paragraph("Invoice ID: " + payment.getTransactionId()));
            document.add(new Paragraph("User ID: " + payment.getUserId()));
            document.add(new Paragraph("Plan ID: " + payment.getPlanId()));
            document.add(new Paragraph("Amount Paid: Rs " + payment.getAmount()));
            document.add(new Paragraph("Payment Status: " + payment.getPaymentStatus()));
            document.add(new Paragraph("Date: " + payment.getTimeStamp()));
            
            // Footer
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Thank you for using Zidio Connect!"));
            
            document.close();
            
            return baos.toByteArray();
            
        } catch (Exception e) {
            throw new RuntimeException("Error generating invoice", e);
        }
    }
}