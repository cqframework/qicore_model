package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.util.List;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorepractitionerSpecialtyAdapter
{

   private CodeableConcept adaptedClass;

   public qicorepractitionerSpecialtyAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.CodeableConcept();
   }

   public qicorepractitionerSpecialtyAdapter(CodeableConcept adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public CodeableConcept getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(CodeableConcept param)
   {
      this.adaptedClass = param;
   }

   public BooleanType getPrimaryInd()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/practitioner-primaryInd");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.BooleanType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for primaryInd");
      }
   }

   public qicorepractitionerSpecialtyAdapter setPrimaryInd(BooleanType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/practitioner-primaryInd")
            .setValue(param);
      return this;
   }

   public List<Coding> getCoding()
   {
      try
      {
         return adaptedClass.getCoding();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Coding", e);
      }
   }

   public qicorepractitionerSpecialtyAdapter setCoding(List<Coding> param)
   {
      adaptedClass.setCoding(param);
      return this;
   }

   public boolean hasCoding()
   {
      return adaptedClass.hasCoding();
   }

   public qicorepractitionerSpecialtyAdapter addCoding(Coding param)
   {
      adaptedClass.addCoding(param);
      return this;
   }

   public Coding addCoding()
   {
      return adaptedClass.addCoding();
   }

   public boolean hasText()
   {
      return adaptedClass.hasText();
   }

   public boolean hasTextElement()
   {
      return adaptedClass.hasTextElement();
   }

   public StringType getTextElement()
   {
      try
      {
         return adaptedClass.getTextElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting TextElement", e);
      }
   }

   public String getText()
   {
      try
      {
         return adaptedClass.getText();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Text", e);
      }
   }

   public qicorepractitionerSpecialtyAdapter setTextElement(StringType param)
   {
      adaptedClass.setTextElement(param);
      return this;
   }

   public qicorepractitionerSpecialtyAdapter setText(String param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public StringType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public qicorepractitionerSpecialtyAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicorepractitionerSpecialtyAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }
}