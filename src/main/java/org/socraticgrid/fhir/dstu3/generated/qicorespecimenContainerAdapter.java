package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Identifier;
import java.util.List;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.IntegerType;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorespecimenContainerAdapter
{

   private Specimen.SpecimenContainerComponent adaptedClass;

   public qicorespecimenContainerAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent();
   }

   public qicorespecimenContainerAdapter(
         Specimen.SpecimenContainerComponent adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Specimen.SpecimenContainerComponent getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Specimen.SpecimenContainerComponent param)
   {
      this.adaptedClass = param;
   }

   public SimpleQuantity getCapacity()
   {
      try
      {
         return adaptedClass.getCapacity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Capacity", e);
      }
   }

   public qicorespecimenContainerAdapter setCapacity(SimpleQuantity param)
   {
      adaptedClass.setCapacity(param);
      return this;
   }

   public boolean hasCapacity()
   {
      return adaptedClass.hasCapacity();
   }

   public Type getAdditive()
   {
      try
      {
         return adaptedClass.getAdditive();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Additive", e);
      }
   }

   public qicorespecimenContainerAdapter setAdditive(Type param)
   {
      adaptedClass.setAdditive(param);
      return this;
   }

   public CodeableConcept getAdditiveCodeableConcept()
   {
      try
      {
         return adaptedClass.getAdditiveCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AdditiveCodeableConcept",
               e);
      }
   }

   public boolean hasAdditiveCodeableConcept()
   {
      return adaptedClass.hasAdditiveCodeableConcept();
   }

   public boolean hasAdditive()
   {
      return adaptedClass.hasAdditive();
   }

   public Reference getAdditiveReference()
   {
      try
      {
         return adaptedClass.getAdditiveReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AdditiveReference", e);
      }
   }

   public Substance getAdditiveTarget()
   {
      return (org.hl7.fhir.dstu3.model.Substance) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getAdditive()).getResource();
   }

   public qicorespecimenContainerAdapter setAdditive(Reference param)
   {
      adaptedClass.setAdditive(param);
      return this;
   }

   public qicorespecimenContainerAdapter setAdditiveTarget(Substance param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setAdditive(reference);
      return this;
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public qicorespecimenContainerAdapter setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public qicorespecimenContainerAdapter addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public qicorespecimenContainerAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicorespecimenContainerAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
   }

   public boolean hasDescriptionElement()
   {
      return adaptedClass.hasDescriptionElement();
   }

   public StringType getDescriptionElement()
   {
      try
      {
         return adaptedClass.getDescriptionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DescriptionElement", e);
      }
   }

   public String getDescription()
   {
      try
      {
         return adaptedClass.getDescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Description", e);
      }
   }

   public qicorespecimenContainerAdapter setDescriptionElement(StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public qicorespecimenContainerAdapter setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public CodeableConcept getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public qicorespecimenContainerAdapter setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public SimpleQuantity getSpecimenQuantity()
   {
      try
      {
         return adaptedClass.getSpecimenQuantity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SpecimenQuantity", e);
      }
   }

   public qicorespecimenContainerAdapter setSpecimenQuantity(
         SimpleQuantity param)
   {
      adaptedClass.setSpecimenQuantity(param);
      return this;
   }

   public boolean hasSpecimenQuantity()
   {
      return adaptedClass.hasSpecimenQuantity();
   }

   public IntegerType getSequenceNumber()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/specimen-sequenceNumber");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.IntegerType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for sequenceNumber");
      }
   }

   public qicorespecimenContainerAdapter setSequenceNumber(IntegerType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/specimen-sequenceNumber")
            .setValue(param);
      return this;
   }
}