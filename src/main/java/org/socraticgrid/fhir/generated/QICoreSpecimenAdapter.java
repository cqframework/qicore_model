package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreSpecimen;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.CodeDt;
import org.socraticgrid.fhir.generated.QICoreSpecimenContainer;
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

public class QICoreSpecimenAdapter implements IQICoreSpecimen
{

   private Specimen adaptedClass = null;

   public QICoreSpecimenAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Specimen();
   }

   public QICoreSpecimenAdapter(Specimen adaptee)
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

   public IQICoreSpecimen setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<Specimen.Treatment> getTreatment()
   {
      return adaptedClass.getTreatment();
   }

   public IQICoreSpecimen setTreatment(List<Specimen.Treatment> param)
   {
      adaptedClass.setTreatment(param);
      return this;
   }

   public IQICoreSpecimen addTreatment(Specimen.Treatment param)
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

   public IQICoreSpecimen setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Specimen.Collection getCollection()
   {
      return adaptedClass.getCollection();
   }

   public IQICoreSpecimen setCollection(Specimen.Collection param)
   {
      adaptedClass.setCollection(param);
      return this;
   }

   public List<QICoreSpecimenContainer> getWrappedContainer() {
		List<org.socraticgrid.fhir.generated.QICoreSpecimenContainer> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.resource.Specimen.Container type : adaptedClass
				.getContainer()) {
			items.add(new org.socraticgrid.fhir.generated.QICoreSpecimenContainer(
					type));
		}
		return items;
	}

   public IQICoreSpecimen setWrappedContainer(
			List<QICoreSpecimenContainer> param) {
		List<ca.uhn.fhir.model.dstu2.resource.Specimen.Container> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICoreSpecimenContainer item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setContainer(items);
		return this;
	}

   public IQICoreSpecimen addWrappedContainer(QICoreSpecimenContainer param)
   {
      if (param != null)
      {
         adaptedClass.addContainer(param.getAdaptee());
      }
      return this;
   }

   public QICoreSpecimenContainer addWrappedContainer()
   {
      ca.uhn.fhir.model.dstu2.resource.Specimen.Container item = new ca.uhn.fhir.model.dstu2.resource.Specimen.Container();
      adaptedClass.addContainer(item);
      return new org.socraticgrid.fhir.generated.QICoreSpecimenContainer(item);
   }

   public QICoreSpecimenContainer getWrappedContainerFirstRep()
   {
      org.socraticgrid.fhir.generated.QICoreSpecimenContainer wrapperItem = new org.socraticgrid.fhir.generated.QICoreSpecimenContainer();
      ca.uhn.fhir.model.dstu2.resource.Specimen.Container item = adaptedClass
            .getContainerFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICoreSpecimenContainer(
               item);
      }
      return wrapperItem;
   }

   public List<Specimen.Container> getContainer()
   {
      return adaptedClass.getContainer();
   }

   public IQICoreSpecimen setContainer(List<Specimen.Container> param)
   {
      adaptedClass.setContainer(param);
      return this;
   }

   public IQICoreSpecimen addContainer(Specimen.Container param)
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

   public IQICoreSpecimen setAccessionIdentifier(IdentifierDt param)
   {
      adaptedClass.setAccessionIdentifier(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreSpecimen setContained(ContainedDt param)
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

   public IQICoreSpecimen setReceivedTime(Date param)
   {
      adaptedClass
            .setReceivedTime(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IQICoreSpecimen setReceivedTime(DateTimeDt param)
   {
      adaptedClass.setReceivedTime(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public IQICoreSpecimen setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreSpecimen setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreSpecimen setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreSpecimen setStatus(SpecimenStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<SpecimenStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreSpecimen setStatus(BoundCodeDt<SpecimenStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreSpecimen setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreSpecimen addIdentifier(IdentifierDt param)
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