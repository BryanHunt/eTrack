/**
 */
package org.eclipselabs.etrack.domain.task.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.audit.AuditableItem;

import org.eclipselabs.etrack.domain.data.Artifact;
import org.eclipselabs.etrack.domain.data.CategorizedItem;
import org.eclipselabs.etrack.domain.data.Linkable;
import org.eclipselabs.etrack.domain.data.LinkedContent;
import org.eclipselabs.etrack.domain.data.TaggableItem;

import org.eclipselabs.etrack.domain.entity.AssignableItem;

import org.eclipselabs.etrack.domain.task.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage
 * @generated
 */
public class TaskSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TaskPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TaskPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TaskPackage.ATTACHMENT:
      {
        Attachment attachment = (Attachment)theEObject;
        T result = caseAttachment(attachment);
        if (result == null) result = caseArtifact(attachment);
        if (result == null) result = caseAssignableItem(attachment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.ATTACHMENT_DATA:
      {
        AttachmentData attachmentData = (AttachmentData)theEObject;
        T result = caseAttachmentData(attachmentData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseAssignableItem(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.DURATION:
      {
        Duration duration = (Duration)theEObject;
        T result = caseDuration(duration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = caseAssignableItem(task);
        if (result == null) result = caseAuditableItem(task);
        if (result == null) result = caseLinkable(task);
        if (result == null) result = caseCategorizedItem(task);
        if (result == null) result = caseTaggableItem(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_GROUP:
      {
        TaskGroup taskGroup = (TaskGroup)theEObject;
        T result = caseTaskGroup(taskGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_TYPE:
      {
        TaskType taskType = (TaskType)theEObject;
        T result = caseTaskType(taskType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_RELATIONSHIP:
      {
        TaskRelationship taskRelationship = (TaskRelationship)theEObject;
        T result = caseTaskRelationship(taskRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.RELATED_TASKS_MAPPING:
      {
        @SuppressWarnings("unchecked") Map.Entry<TaskRelationship, Task> relatedTasksMapping = (Map.Entry<TaskRelationship, Task>)theEObject;
        T result = caseRelatedTasksMapping(relatedTasksMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_RESOLUTION:
      {
        TaskResolution taskResolution = (TaskResolution)theEObject;
        T result = caseTaskResolution(taskResolution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_ATTRIBUTE_CHANGE:
      {
        TaskAttributeChange taskAttributeChange = (TaskAttributeChange)theEObject;
        T result = caseTaskAttributeChange(taskAttributeChange);
        if (result == null) result = caseAction(taskAttributeChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_DOMAIN_LINK:
      {
        TaskDomainLink taskDomainLink = (TaskDomainLink)theEObject;
        T result = caseTaskDomainLink(taskDomainLink);
        if (result == null) result = caseLinkedContent(taskDomainLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_MODEL_VERSION:
      {
        TaskModelVersion taskModelVersion = (TaskModelVersion)theEObject;
        T result = caseTaskModelVersion(taskModelVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_QUERY:
      {
        TaskQuery taskQuery = (TaskQuery)theEObject;
        T result = caseTaskQuery(taskQuery);
        if (result == null) result = caseAssignableItem(taskQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TaskPackage.TASK_DOMAIN:
      {
        TaskDomain taskDomain = (TaskDomain)theEObject;
        T result = caseTaskDomain(taskDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttachment(Attachment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attachment Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attachment Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttachmentData(AttachmentData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDuration(Duration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskGroup(TaskGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskType(TaskType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskRelationship(TaskRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Related Tasks Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Related Tasks Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelatedTasksMapping(Map.Entry<TaskRelationship, Task> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskResolution(TaskResolution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskAttributeChange(TaskAttributeChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDomainLink(TaskDomainLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskModelVersion(TaskModelVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskQuery(TaskQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDomain(TaskDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifact(Artifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignable Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignable Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignableItem(AssignableItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auditable Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auditable Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuditableItem(AuditableItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linkable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linkable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkable(Linkable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Categorized Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Categorized Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategorizedItem(CategorizedItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Taggable Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Taggable Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaggableItem(TaggableItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linked Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linked Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkedContent(LinkedContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TaskSwitch
