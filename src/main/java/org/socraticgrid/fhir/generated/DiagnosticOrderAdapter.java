package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IDiagnosticOrder;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class DiagnosticOrderAdapter implements IDiagnosticOrder
{

   private DiagnosticOrder adaptedClass = null;

   public DiagnosticOrderAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder();
   }

   public DiagnosticOrderAdapter(DiagnosticOrder adaptee)
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

   public Practitioner getOrdererResource()
   {
      if (adaptedClass.getOrderer().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
               .getOrderer().getResource();
      }
      else
      {
         return null;
      }
   }

   public IDiagnosticOrder setOrdererResource(Practitioner param)
   {
      adaptedClass.getOrderer().setResource(param);
      return this;
   }

   public List<DiagnosticOrder.Event> getEvent()
   {
      return adaptedClass.getEvent();
   }

   public IDiagnosticOrder setEvent(List<DiagnosticOrder.Event> param)
   {
      adaptedClass.setEvent(param);
      return this;
   }

   public IDiagnosticOrder addEvent(DiagnosticOrder.Event param)
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

   public IDiagnosticOrder setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IDiagnosticOrder setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IDiagnosticOrder setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public String getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IDiagnosticOrder setPriority(String param)
   {
      adaptedClass
            .setPriority(ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum
                  .valueOf(param));
      return this;
   }

   public IDiagnosticOrder setPriority(DiagnosticOrderPriorityEnum param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public BoundCodeDt<DiagnosticOrderPriorityEnum> getPriorityElement()
   {
      return adaptedClass.getPriorityElement();
   }

   public IDiagnosticOrder setPriority(
         BoundCodeDt<DiagnosticOrderPriorityEnum> param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IDiagnosticOrder setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum
                  .valueOf(param));
      return this;
   }

   public IDiagnosticOrder setStatus(DiagnosticOrderStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IDiagnosticOrder setStatus(
         BoundCodeDt<DiagnosticOrderStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IDiagnosticOrder setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<DiagnosticOrder.Item> getItem()
   {
      return adaptedClass.getItem();
   }

   public IDiagnosticOrder setItem(List<DiagnosticOrder.Item> param)
   {
      adaptedClass.setItem(param);
      return this;
   }

   public IDiagnosticOrder addItem(DiagnosticOrder.Item param)
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

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IDiagnosticOrder setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IDiagnosticOrder addIdentifier(IdentifierDt param)
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

   public List<AnnotationDt> getNote()
   {
      return adaptedClass.getNote();
   }

   public IDiagnosticOrder setNote(List<AnnotationDt> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public IDiagnosticOrder addNote(AnnotationDt param)
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

   public IDiagnosticOrder setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}