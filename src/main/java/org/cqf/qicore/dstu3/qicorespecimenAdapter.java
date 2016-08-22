package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Specimen;
import java.util.List;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.*;

public class qicorespecimenAdapter implements Iqicorespecimen
{

   private Specimen adaptedClass;

   public qicorespecimenAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Specimen();
   }

   public qicorespecimenAdapter(Specimen adaptee)
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

   public List<Specimen.SpecimenTreatmentComponent> getTreatment()
   {
      try
      {
         return adaptedClass.getTreatment();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Treatment", e);
      }
   }

   public qicorespecimenAdapter setTreatment(
         List<Specimen.SpecimenTreatmentComponent> param)
   {
      adaptedClass.setTreatment(param);
      return this;
   }

   public boolean hasTreatment()
   {
      return adaptedClass.hasTreatment();
   }

   public qicorespecimenAdapter addTreatment(
         Specimen.SpecimenTreatmentComponent param)
   {
      adaptedClass.addTreatment(param);
      return this;
   }

   public Specimen.SpecimenTreatmentComponent addTreatment()
   {
      return adaptedClass.addTreatment();
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicorespecimen setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorespecimen setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicorespecimen setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorespecimen setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Specimen.SpecimenCollectionComponent getCollection()
   {
      try
      {
         return adaptedClass.getCollection();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Collection", e);
      }
   }

   public qicorespecimenAdapter setCollection(
         Specimen.SpecimenCollectionComponent param)
   {
      adaptedClass.setCollection(param);
      return this;
   }

   public boolean hasCollection()
   {
      return adaptedClass.hasCollection();
   }

   public List<qicorespecimenContainerAdapter> getWrappedContainer() {
		List<qicorespecimenContainerAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent> items = adaptedClass
				.getContainer();
		for (org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent item : items) {
			wrappedItems
					.add(new qicorespecimenContainerAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicorespecimen setWrappedContainer(
			List<qicorespecimenContainerAdapter> param) {
		List<org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent> items = new java.util.ArrayList<>();
		for (qicorespecimenContainerAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getContainer().addAll(items);
		return this;
	}

   public Iqicorespecimen addWrappedContainer(
         qicorespecimenContainerAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addContainer(param.getAdaptee());
      }
      return this;
   }

   public qicorespecimenContainerAdapter addWrappedContainer()
   {
      org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent item = new org.hl7.fhir.dstu3.model.Specimen.SpecimenContainerComponent();
      adaptedClass.addContainer(item);
      return new qicorespecimenContainerAdapter(
            item);
   }

   public List<Specimen.SpecimenContainerComponent> getContainer()
   {
      try
      {
         return adaptedClass.getContainer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Container", e);
      }
   }

   public Iqicorespecimen setContainer(
         List<Specimen.SpecimenContainerComponent> param)
   {
      adaptedClass.setContainer(param);
      return this;
   }

   public boolean hasContainer()
   {
      return adaptedClass.hasContainer();
   }

   public Iqicorespecimen addContainer(
         Specimen.SpecimenContainerComponent param)
   {
      adaptedClass.addContainer(param);
      return this;
   }

   public Specimen.SpecimenContainerComponent addContainer()
   {
      return adaptedClass.addContainer();
   }

   public Identifier getAccessionIdentifier()
   {
      try
      {
         return adaptedClass.getAccessionIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AccessionIdentifier", e);
      }
   }

   public Iqicorespecimen setAccessionIdentifier(Identifier param)
   {
      adaptedClass.setAccessionIdentifier(param);
      return this;
   }

   public boolean hasAccessionIdentifier()
   {
      return adaptedClass.hasAccessionIdentifier();
   }

   public boolean hasParent()
   {
      return adaptedClass.hasParent();
   }

   public List<Reference> getParent()
   {
      return adaptedClass.getParent();
   }

   public boolean hasRequest()
   {
      return adaptedClass.hasRequest();
   }

   public List<DiagnosticRequest> getRequestDiagnosticRequestTarget() {
		List<org.hl7.fhir.dstu3.model.DiagnosticRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRequestTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.DiagnosticRequest) resource);
		}
		return items;
	}

   public List<Reference> getRequest()
   {
      return adaptedClass.getRequest();
   }

   public List<ProcedureRequest> getRequestProcedureRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ProcedureRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRequestTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ProcedureRequest) resource);
		}
		return items;
	}

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicorespecimen setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorespecimen addContained(Resource param)
   {
      adaptedClass.addContained(param);
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

   public Iqicorespecimen setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public IdType getIdElement()
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

   public Iqicorespecimen setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorespecimen setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public Specimen.SpecimenStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<Specimen.SpecimenStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicorespecimen setStatus(Specimen.SpecimenStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorespecimen setStatusElement(
         Enumeration<Specimen.SpecimenStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public Reference getSubject()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Resource getSubjectTarget()
   {
      try
      {
         return adaptedClass.getSubjectTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SubjectTarget", e);
      }
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getSubjectPatient()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Iqicorespecimen setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorespecimen setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectPatientAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorespecimen setSubjectAdapterTarget(qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectDevice()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Device getSubjectDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorespecimen setSubjectTarget(Device param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorespecimen setSubjectAdapterTarget(qicoredeviceAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectSubstance()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Substance getSubjectSubstanceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Substance) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorespecimen setSubjectTarget(Substance param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoresubstanceAdapter getSubjectSubstanceAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Substance)
      {
         qicoresubstanceAdapter profiledType = new qicoresubstanceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Substance) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorespecimen setSubjectAdapterTarget(qicoresubstanceAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectGroup()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Group getSubjectGroupTarget()
   {
      return (org.hl7.fhir.dstu3.model.Group) adaptedClass.getSubjectTarget();
   }

   public Iqicorespecimen setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
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

   public Iqicorespecimen setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorespecimen addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public Iqicorespecimen setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicorespecimen addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }
}