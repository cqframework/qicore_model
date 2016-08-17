package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.StringDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICorePractitionerSpecialty
{

   private CodeableConceptDt adaptedClass = null;

   public QICorePractitionerSpecialty()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt();
   }

   public QICorePractitionerSpecialty(CodeableConceptDt adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public CodeableConceptDt getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(CodeableConceptDt param)
   {
      this.adaptedClass = param;
   }

   public StringDt getTextElement()
   {
      return adaptedClass.getTextElement();
   }

   public String getText()
   {
      return adaptedClass.getText();
   }

   public QICorePractitionerSpecialty setText(String param)
   {
      adaptedClass.setText(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICorePractitionerSpecialty setText(StringDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<CodingDt> getCoding()
   {
      return adaptedClass.getCoding();
   }

   public QICorePractitionerSpecialty setCoding(List<CodingDt> param)
   {
      adaptedClass.setCoding(param);
      return this;
   }

   public QICorePractitionerSpecialty addCoding(CodingDt param)
   {
      adaptedClass.addCoding(param);
      return this;
   }

   public CodingDt addCoding()
   {
      ca.uhn.fhir.model.dstu2.composite.CodingDt item = new ca.uhn.fhir.model.dstu2.composite.CodingDt();
      adaptedClass.addCoding(item);
      return item;
   }

   public CodingDt getCodingFirstRep()
   {
      return adaptedClass.getCodingFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICorePractitionerSpecialty setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public BooleanDt getPrimaryInd()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/practitioner-primaryInd");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for primaryInd");
      }
   }

   public QICorePractitionerSpecialty setPrimaryInd(BooleanDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/practitioner-primaryInd",
                  param);
      return this;
   }
}