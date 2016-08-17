package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreDiagnosticOrder;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreDiagnosticOrderAdapter implements IQICoreDiagnosticOrder
{

   private DiagnosticOrder adaptedClass = null;

   public QICoreDiagnosticOrderAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder();
   }

   public QICoreDiagnosticOrderAdapter(DiagnosticOrder adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticOrder getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticOrder param)
   {
      this.adaptedClass = param;
   }

   public QICorePractitionerAdapter getOrdererResource()
   {
      if (adaptedClass.getOrderer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
                     .getOrderer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreDiagnosticOrder setOrdererResource(
         QICorePractitionerAdapter param)
   {
      adaptedClass.getOrderer().setResource(param.getAdaptee());
      return this;
   }

   public List<DiagnosticOrder.Event> getEvent()
   {
      return adaptedClass.getEvent();
   }

   public IQICoreDiagnosticOrder setEvent(List<DiagnosticOrder.Event> param)
   {
      adaptedClass.setEvent(param);
      return this;
   }

   public IQICoreDiagnosticOrder addEvent(DiagnosticOrder.Event param)
   {
      adaptedClass.addEvent(param);
      return this;
   }

   public DiagnosticOrder.Event addEvent()
   {
      ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Event item = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Event();
      adaptedClass.addEvent(item);
      return item;
   }

   public DiagnosticOrder.Event getEventFirstRep()
   {
      return adaptedClass.getEventFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreDiagnosticOrder setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreDiagnosticOrder setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreDiagnosticOrder setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public String getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IQICoreDiagnosticOrder setPriority(String param)
   {
      adaptedClass
            .setPriority(ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreDiagnosticOrder setPriority(DiagnosticOrderPriorityEnum param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public BoundCodeDt<DiagnosticOrderPriorityEnum> getPriorityElement()
   {
      return adaptedClass.getPriorityElement();
   }

   public IQICoreDiagnosticOrder setPriority(
         BoundCodeDt<DiagnosticOrderPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreDiagnosticOrder setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreDiagnosticOrder setStatus(DiagnosticOrderStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreDiagnosticOrder setStatus(
         BoundCodeDt<DiagnosticOrderStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<QICoreDiagnosticOrderItem> getWrappedItem() {
		List<org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item type : adaptedClass
				.getItem()) {
			items.add(new org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem(
					type));
		}
		return items;
	}

   public IQICoreDiagnosticOrder setWrappedItem(
			List<QICoreDiagnosticOrderItem> param) {
		List<ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setItem(items);
		return this;
	}

   public IQICoreDiagnosticOrder addWrappedItem(QICoreDiagnosticOrderItem param)
   {
      if (param != null)
      {
         adaptedClass.addItem(param.getAdaptee());
      }
      return this;
   }

   public QICoreDiagnosticOrderItem addWrappedItem()
   {
      ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item item = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item();
      adaptedClass.addItem(item);
      return new org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem(
            item);
   }

   public QICoreDiagnosticOrderItem getWrappedItemFirstRep()
   {
      org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem wrapperItem = new org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem();
      ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item item = adaptedClass
            .getItemFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICoreDiagnosticOrderItem(
               item);
      }
      return wrapperItem;
   }

   public List<DiagnosticOrder.Item> getItem()
   {
      return adaptedClass.getItem();
   }

   public IQICoreDiagnosticOrder setItem(List<DiagnosticOrder.Item> param)
   {
      adaptedClass.setItem(param);
      return this;
   }

   public IQICoreDiagnosticOrder addItem(DiagnosticOrder.Item param)
   {
      adaptedClass.addItem(param);
      return this;
   }

   public DiagnosticOrder.Item addItem()
   {
      ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item item = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item();
      adaptedClass.addItem(item);
      return item;
   }

   public DiagnosticOrder.Item getItemFirstRep()
   {
      return adaptedClass.getItemFirstRep();
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreDiagnosticOrder setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreDiagnosticOrder setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreDiagnosticOrder addIdentifier(IdentifierDt param)
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

   public CodeableConceptDt getReasonRejected()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/diagnosticorder-reasonRejected");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRejected");
      }
   }

   public IQICoreDiagnosticOrder setReasonRejected(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/diagnosticorder-reasonRejected",
                  param);
      return this;
   }

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreDiagnosticOrder setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IQICoreDiagnosticOrder addNote(AnnotationDt param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public AnnotationDt addNote()
   {
      ca.uhn.fhir.model.dstu2.composite.AnnotationDt item = new ca.uhn.fhir.model.dstu2.composite.AnnotationDt();
      adaptedClass.addNote(item);
      return item;
   }

   public AnnotationDt getNoteFirstRep()
   {
      return adaptedClass.getNoteFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreDiagnosticOrder setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}