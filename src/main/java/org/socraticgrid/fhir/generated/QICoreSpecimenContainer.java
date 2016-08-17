package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreSpecimenContainer
{

   private Specimen.Container adaptedClass = null;

   public QICoreSpecimenContainer()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Specimen.Container();
   }

   public QICoreSpecimenContainer(Specimen.Container adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Specimen.Container getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Specimen.Container param)
   {
      this.adaptedClass = param;
   }

   public SimpleQuantityDt getCapacity()
   {
      return adaptedClass.getCapacity();
   }

   public QICoreSpecimenContainer setCapacity(SimpleQuantityDt param)
   {
      adaptedClass.setCapacity(param);
      return this;
   }

   public BoundCodeableConceptDt getAdditiveCodeableConcept()
   {
      if (adaptedClass.getAdditive() != null
            && adaptedClass.getAdditive() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getAdditive();
      }
      else
      {
         return null;
      }
   }

   public QICoreSpecimenContainer setAdditiveCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setAdditive(param);
      return this;
   }

   public ResourceReferenceDt getAdditiveReference()
   {
      if (adaptedClass.getAdditive() != null
            && adaptedClass.getAdditive() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getAdditive();
      }
      else
      {
         return null;
      }
   }

   public QICoreSpecimenContainer setAdditiveReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setAdditive(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public QICoreSpecimenContainer setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public QICoreSpecimenContainer addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICoreSpecimenContainer setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public QICoreSpecimenContainer setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public QICoreSpecimenContainer setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public QICoreSpecimenContainer setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public SimpleQuantityDt getSpecimenQuantity()
   {
      return adaptedClass.getSpecimenQuantity();
   }

   public QICoreSpecimenContainer setSpecimenQuantity(SimpleQuantityDt param)
   {
      adaptedClass.setSpecimenQuantity(param);
      return this;
   }

   public IntegerDt getSequenceNumber()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/specimen-sequenceNumber");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.IntegerDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for sequenceNumber");
      }
   }

   public QICoreSpecimenContainer setSequenceNumber(IntegerDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/specimen-sequenceNumber",
                  param);
      return this;
   }
}