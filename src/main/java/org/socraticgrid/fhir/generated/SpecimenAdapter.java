package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.ISpecimen;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class SpecimenAdapter implements ISpecimen
{

   private Specimen adaptedClass = null;

   public SpecimenAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Specimen();
   }

   public SpecimenAdapter(Specimen adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Specimen getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Specimen param)
   {
      this.adaptedClass = param;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public ISpecimen setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<Specimen.Treatment> getTreatment()
   {
      return adaptedClass.getTreatment();
   }

   public ISpecimen setTreatment(List<Specimen.Treatment> param)
   {
      adaptedClass.setTreatment(param);
      return this;
   }

   public ISpecimen addTreatment(Specimen.Treatment param)
   {
      adaptedClass.addTreatment(param);
      return this;
   }

   public Specimen.Treatment addTreatment()
   {
      ca.uhn.fhir.model.dstu2.resource.Specimen.Treatment item = new ca.uhn.fhir.model.dstu2.resource.Specimen.Treatment();
      adaptedClass.addTreatment(item);
      return item;
   }

   public Specimen.Treatment getTreatmentFirstRep()
   {
      return adaptedClass.getTreatmentFirstRep();
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public ISpecimen setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Specimen.Collection getCollection()
   {
      return adaptedClass.getCollection();
   }

   public ISpecimen setCollection(Specimen.Collection param)
   {
      adaptedClass.setCollection(param);
      return this;
   }

   public List<Specimen.Container> getContainer()
   {
      return adaptedClass.getContainer();
   }

   public ISpecimen setContainer(List<Specimen.Container> param)
   {
      adaptedClass.setContainer(param);
      return this;
   }

   public ISpecimen addContainer(Specimen.Container param)
   {
      adaptedClass.addContainer(param);
      return this;
   }

   public Specimen.Container addContainer()
   {
      ca.uhn.fhir.model.dstu2.resource.Specimen.Container item = new ca.uhn.fhir.model.dstu2.resource.Specimen.Container();
      adaptedClass.addContainer(item);
      return item;
   }

   public Specimen.Container getContainerFirstRep()
   {
      return adaptedClass.getContainerFirstRep();
   }

   public IdentifierDt getAccessionIdentifier()
   {
      return adaptedClass.getAccessionIdentifier();
   }

   public ISpecimen setAccessionIdentifier(IdentifierDt param)
   {
      adaptedClass.setAccessionIdentifier(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public ISpecimen setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public DateTimeDt getReceivedTimeElement()
   {
      return adaptedClass.getReceivedTimeElement();
   }

   public Date getReceivedTime()
   {
      return adaptedClass.getReceivedTime();
   }

   public ISpecimen setReceivedTime(Date param)
   {
      adaptedClass
            .setReceivedTime(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public ISpecimen setReceivedTime(DateTimeDt param)
   {
      adaptedClass.setReceivedTime(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public ISpecimen setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public ISpecimen setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public ISpecimen setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum
                  .valueOf(param));
      return this;
   }

   public ISpecimen setStatus(SpecimenStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<SpecimenStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public ISpecimen setStatus(BoundCodeDt<SpecimenStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public ISpecimen setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public ISpecimen addIdentifier(IdentifierDt param)
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
}