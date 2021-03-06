/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.cleanCode.util;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="ServiceContext.java.html"><b><i>View Source</i></b></a>
 *
 * @author Raymond Augé
 * @author Brian Wing Shun Chan
 * @author Jorge Ferrer
 *
 */
public class ServiceContext implements Serializable {

	public ServiceContext() {
		_attributes = new LinkedHashMap<String, Serializable>();
		_expandoBridgeAttributes = new LinkedHashMap<String, Serializable>();
	}

	public boolean getAddCommunityPermissions() {
		return _addCommunityPermissions;
	}

	public boolean getAddGuestPermissions() {
		return _addGuestPermissions;
	}

	public Serializable getAttribute(String name) {
		return _attributes.get(name);
	}

	public Map<String, Serializable> getAttributes() {
		return _attributes;
	}

	public String[] getCommunityPermissions() {
		return _communityPermissions;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public Map<String, Serializable> getExpandoBridgeAttributes() {
		return _expandoBridgeAttributes;
	}

	public String[] getGuestPermissions() {
		return _guestPermissions;
	}

	public String getLanguageId() {
		return _languageId;
	}

	public String getLayoutURL() {
		return _layoutURL;
	}

	public String getPathMain() {
		return _pathMain;
	}

	public long getPlid() {
		return _plid;
	}

	public String getPortalURL() {
		return _portalURL;
	}



	public long getScopeGroupId() {
		return _scopeGroupId;
	}

	public String[] getTagsCategories() {
		return _tagsCategories;
	}

	public String[] getTagsEntries() {
		return _tagsEntries;
	}

	public String getUserDisplayURL() {
		return _userDisplayURL;
	}

	public long getUserId() {
		return _userId;
	}

	public void setAddCommunityPermissions(boolean addCommunityPermissions) {
		_addCommunityPermissions = addCommunityPermissions;
	}

	public void setAddGuestPermissions(boolean addGuestPermissions) {
		_addGuestPermissions = addGuestPermissions;
	}

	public void setAttribute(String name, Serializable value) {
		_attributes.put(name, value);
	}

	public void setAttributes(Map<String, Serializable> attributes) {
		_attributes = attributes;
	}

	public void setCommunityPermissions(String[] communityPermissions) {
		_communityPermissions = communityPermissions;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public void setExpandoBridgeAttributes(
		Map<String, Serializable> expandoBridgeAttributes) {

		_expandoBridgeAttributes = expandoBridgeAttributes;
	}

	public void setGuestPermissions(String[] guestPermissions) {
		_guestPermissions = guestPermissions;
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public void setLayoutURL(String layoutURL) {
		_layoutURL = layoutURL;
	}

	public void setPathMain(String pathMain) {
		_pathMain = pathMain;
	}

	public void setPlid(long plid) {
		_plid = plid;
	}

	public void setPortalURL(String portalURL) {
		_portalURL = portalURL;
	}



	public void setScopeGroupId(long scopeGroupId) {
		_scopeGroupId = scopeGroupId;
	}

	public void setTagsCategories(String[] tagsCategories) {
		_tagsCategories = tagsCategories;
	}

	public void setTagsEntries(String[] tagsEntries) {
		_tagsEntries = tagsEntries;
	}

	public void setUserDisplayURL(String userDisplayURL) {
		_userDisplayURL = userDisplayURL;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private boolean _addCommunityPermissions;
	private boolean _addGuestPermissions;
	private Map<String, Serializable> _attributes;
	private String[] _communityPermissions;
	private long _companyId;
	private Map<String, Serializable> _expandoBridgeAttributes;
	private String[] _guestPermissions;
	private String _languageId;
	private String _layoutURL;
	private String _pathMain;
	private String _portalURL;
	private long _scopeGroupId;
	private String[] _tagsCategories;
	private String[] _tagsEntries;
	private String _userDisplayURL;
	private long _plid;
	private long _userId;

}