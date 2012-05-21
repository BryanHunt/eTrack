/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipselabs.etrack.domain.entity.AssignableItem;
import org.eclipselabs.etrack.domain.entity.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Comment#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Comment#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment()
 * @model kind="class"
 * @generated
 */
public class Comment extends MinimalEObjectImpl.Container implements AssignableItem
{
  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected Person owner;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedOn()
   * @generated
   * @ordered
   */
  protected static final Date CREATED_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedOn()
   * @generated
   * @ordered
   */
  protected Date createdOn = CREATED_ON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Comment()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TaskPackage.Literals.COMMENT;
  }

  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see #setOwner(Person)
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem_Owner()
   * @model
   * @generated
   */
  public Person getOwner()
  {
    if (owner != null && owner.eIsProxy())
    {
      InternalEObject oldOwner = (InternalEObject)owner;
      owner = (Person)eResolveProxy(oldOwner);
      if (owner != oldOwner)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.COMMENT__OWNER, oldOwner, owner));
      }
    }
    return owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetOwner()
  {
    return owner;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Comment#getOwner <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' reference.
   * @see #getOwner()
   * @generated
   */
  public void setOwner(Person newOwner)
  {
    Person oldOwner = owner;
    owner = newOwner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMMENT__OWNER, oldOwner, owner));
  }

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment_Text()
   * @model unique="false"
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Comment#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMMENT__TEXT, oldText, text));
  }

  /**
   * Returns the value of the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created On</em>' attribute.
   * @see #setCreatedOn(Date)
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment_CreatedOn()
   * @model unique="false"
   * @generated
   */
  public Date getCreatedOn()
  {
    return createdOn;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Comment#getCreatedOn <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created On</em>' attribute.
   * @see #getCreatedOn()
   * @generated
   */
  public void setCreatedOn(Date newCreatedOn)
  {
    Date oldCreatedOn = createdOn;
    createdOn = newCreatedOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.COMMENT__CREATED_ON, oldCreatedOn, createdOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TaskPackage.COMMENT__OWNER:
        if (resolve) return getOwner();
        return basicGetOwner();
      case TaskPackage.COMMENT__TEXT:
        return getText();
      case TaskPackage.COMMENT__CREATED_ON:
        return getCreatedOn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TaskPackage.COMMENT__OWNER:
        setOwner((Person)newValue);
        return;
      case TaskPackage.COMMENT__TEXT:
        setText((String)newValue);
        return;
      case TaskPackage.COMMENT__CREATED_ON:
        setCreatedOn((Date)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TaskPackage.COMMENT__OWNER:
        setOwner((Person)null);
        return;
      case TaskPackage.COMMENT__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case TaskPackage.COMMENT__CREATED_ON:
        setCreatedOn(CREATED_ON_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TaskPackage.COMMENT__OWNER:
        return owner != null;
      case TaskPackage.COMMENT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case TaskPackage.COMMENT__CREATED_ON:
        return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (text: ");
    result.append(text);
    result.append(", createdOn: ");
    result.append(createdOn);
    result.append(')');
    return result.toString();
  }

} // Comment
